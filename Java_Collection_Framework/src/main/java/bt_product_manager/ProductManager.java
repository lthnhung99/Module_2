package bt_product_manager;

import java.util.*;

public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Bánh", 10000));
        products.add(new Product(2, "Kẹo", 5000));
        products.add(new Product(3, "Bia", 20000));
        products.add(new Product(4, "Nước ngọt", 15000));
        products.add(new Product(5, "Trà sữa", 25000));
        boolean checkActionMenu = true;
        do {
            showMenu();
            System.out.println("Nhập lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Thêm sản phẩm");
                    addProduct(products);
                    break;
                case 2:
                    System.out.println("Sửa thông tin sản phẩm theo id");
                    editProduct(products);
                    break;
                case 3:
                    System.out.println("Xoá sản phẩm theo id");
                    removeProduct(products);
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm");
                    showListProduct(products);
                    break;
                case 5:
                    int choiceToFind = -1;
                    do {
                        System.out.println("Tìm kiếm sản phẩm");
                        System.out.println("1. Tìm theo ID");
                        System.out.println("2. Tìm theo tên");
                        System.out.println("3. Tìm theo giá");
                        System.out.println("0. Trở lại");
                        choiceToFind = Integer.parseInt(scanner.nextLine());
                        switch (choiceToFind) {
                            case 1:
                                findById(products);
                                break;
                            case 2:
                                findByName(products);

                                break;
                            case 3:
                                findByPrice(products);

                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Nhập lại");
                        }
                    } while (choiceToFind < 0 || choiceToFind > 3);
                    break;
                case 6:
                    int choiceToSort = -1;
                    do {
                        showSortMenu();
                        System.out.println("Nhập lựa chọn");
                        choiceToSort = Integer.parseInt(scanner.nextLine());
                        switch (choiceToSort) {
                            case 1:
                                sortById(products);
                                showListProduct(products);
                                break;
                            case 2:
                                sortByName(products);
                                showListProduct(products);
                                break;
                            case 3:
                                sortByPrice(products);
                                showListProduct(products);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Nhập lại");
                        }
                    } while (choiceToSort < 0 || choiceToSort > 3);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn lại");
            }
            System.out.println("Bạn có muốn tiếp tục hay không?\n Nhập 'Y' để tiếp tục hoặc 'N' để dừng lại");
            String choiceContinue = "-1";
            do {
                choiceContinue = scanner.nextLine().toUpperCase();
                switch (choiceContinue) {
                    case "Y":
                        break;
                    case "N":
                        checkActionMenu = false;
                        break;
                }
            } while (!choiceContinue.equals("Y") && !choiceContinue.equals("N"));
        } while (checkActionMenu);


    }

    public static void sortById(ArrayList<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - (o2.getId());
            }
        });
    }

    public static void sortByName(ArrayList<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public static void sortByPrice(ArrayList<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    public static void editProduct(ArrayList<Product> products) {
        Product presentProduct = findById(products);
        if (presentProduct != null) {
            int select = -1;
            do {
                System.out.println("Nhập thông tin cần sửa");
                System.out.println("1. Sửa hết");
                System.out.println("2. Sửa ID");
                System.out.println("3. Sửa Tên");
                System.out.println("4. Sửa Giá");
                System.out.println("0. Trở lại");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        Product newProduct = inputProduct(products);
                        presentProduct.setId(newProduct.getId());
                        presentProduct.setName(newProduct.getName());
                        presentProduct.setPrice(newProduct.getPrice());
                        showProductById(products, presentProduct.getId());
                        break;
                    case 2:
                        int newID = inputId(products);
                        presentProduct.setId(newID);
                        showProductById(products, presentProduct.getId());
                        break;
                    case 3:
                        String newName = scanner.nextLine();
                        presentProduct.setName(newName);
                        showProductById(products, presentProduct.getId());
                        break;
                    case 4:
                        int newPrice = Integer.parseInt(scanner.nextLine());
                        presentProduct.setPrice(newPrice);
                        showProductById(products, presentProduct.getId());
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Nhập lại");
                }
            } while (select < 0 && select > 4);
        }
    }

    public static void findByPrice(ArrayList<Product> products) {
        System.out.println("Nhập giá cần tìm");
        int price = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (product.getPrice() > price) {
                showProductById(products, product.getId());
            }
        }
    }

    public static void findByName(ArrayList<Product> products) {
        System.out.println("Nhập tên sản phẩm cần tìm");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (name.equalsIgnoreCase(product.getName())) {
                showProductByName(products, name);
                return;
            }
        }
        System.out.println("Tên không đúng");
    }

    public static Product findById(ArrayList<Product> products) {
        System.out.println("Nhập ID cần tìm");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (id == product.getId()) {
                showProductById(products, id);
                return product;
            }
        }
        System.out.println("ID không đúng");
        return null;
    }

    public static void addProduct(ArrayList<Product> products) {
        Product newProduct = inputProduct(products);
        products.add(new Product(newProduct.getId(), newProduct.getName(), newProduct.getPrice()));
        System.out.println("Sản phẩm vừa được thêm vào danh sách");
        showProductById(products, newProduct.getId());

    }

    public static int inputId(ArrayList<Product> products) {
        int id = -1;
        boolean check = true;        // check ID trùng
        while (check) {
            System.out.println("Nhập ID");
            id = Integer.parseInt(scanner.nextLine());
            check = false;
            for (Product product : products) {
                if (id == product.getId()) {
                    check = true;
                    System.out.println("ID đã tồn tại, xin vui lòng nhập lại");
                    break;
                }
            }
        }
        return id;
    }

    public static Product inputProduct(ArrayList<Product> products) {
        int id = inputId(products);
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        return new Product(id, name, price);
    }

    public static void removeProduct(ArrayList<Product> products) {
        System.out.println("Nhập id muốn xoá");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (id == product.getId()) {
                System.out.println("Sản phẩm muốn xoá là");
                System.out.println(product);
                System.out.println("Bạn chắc chắn muốn xoá?\nNhập Y nếu chắc chắn hoặc N nếu không");
                String cf = scanner.nextLine();
                if (cf.equalsIgnoreCase("Y"))
                    products.remove(product);
                break;
            }
            ;
        }
    }

    public static void showProductByName(ArrayList<Product> products, String name) {
        for (Product product : products)
            if (name.equalsIgnoreCase(product.getName())) System.out.println(product);
    }

    public static void showProductById(ArrayList<Product> products, int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(product);
            }
        }
    }

    public static void showListProduct(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }

    }

    public static void showSortMenu() {
        System.out.println("Sắp xếp sản phẩm");
        System.out.println("1. Sắp xếp sản phẩm theo ID");
        System.out.println("2. Sắp xếp sản phẩm theo tên");
        System.out.println("3. Sắp xếp sản phẩm theo giá");
        System.out.println("0. Trở lại");
    }


    public static void showMenu() {
        System.out.println("Product Manager");
        System.out.println("1.Thêm sản phẩm");
        System.out.println("2.Sửa thông tin sản phẩm theo id");
        System.out.println("3.Xoá sản phẩm theo id");
        System.out.println("4.Hiển thị danh sách sản phẩm");
        System.out.println("5.Tìm kiếm sản phẩm theo tên");
        System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
        System.out.println("7.Thoát");
    }

}
