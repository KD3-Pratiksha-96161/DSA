package comQ2;

import java.util.Scanner;

    class EmployeeList {
      static class Node {
            int id;
            String name;
            double salary;
            Node next;

            Node(int id, String name, double salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
                this.next = null;
            }
        }

        private Node head;

       
        //Add Employee
      
        public void addEmployee(int id, String name, double salary) {
            Node newNode = new Node(id, name, salary);
            newNode.next = head;
            head = newNode;
            System.out.println("Employee Added");
        }

        
        // Display
        
        public void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.println(temp.id + " " + temp.name + " " + temp.salary);
                temp = temp.next;
            }
        }

        
        //Search by Name
        
        public void searchByName(String name) {
            Node temp = head;
            while (temp != null) {
                if (temp.name.equalsIgnoreCase(name)) {
                    System.out.println("Found: " + temp.id + " " + temp.salary);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Employee not found");
        }

        
        //Delete by ID
    
        public void deleteById(int id) {
            Node temp = head, prev = null;

            while (temp != null) {
                if (temp.id == id) {
                    if (prev == null)
                        head = temp.next;
                    else
                        prev.next = temp.next;

                    System.out.println("Employee Deleted");
                    return;
                }
                prev = temp;
                temp = temp.next;
            }
            System.out.println("Employee not found");
        }

        
        // Update Salary
        
        public void updateSalary(int id, double newSalary) {
            Node temp = head;

            while (temp != null) {
                if (temp.id == id) {
                    temp.salary = newSalary;
                    System.out.println("Salary Updated");
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Employee not found");
        }

        
        //Sort by Salary
        
        public void sortBySalary() {
            for (Node i = head; i != null; i = i.next) {
                for (Node j = i.next; j != null; j = j.next) {
                    if (i.salary > j.salary) {
                        // swap data
                        int tid = i.id;
                        String tname = i.name;
                        double tsal = i.salary;

                        i.id = j.id;
                        i.name = j.name;
                        i.salary = j.salary;

                        j.id = tid;
                        j.name = tname;
                        j.salary = tsal;
                    }
                }
            }
            System.out.println("Sorted by salary");
        }
    }
    public class Employee {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            EmployeeList list = new EmployeeList();

            int choice;

            do {
                System.out.println("\n--- Employee Menu ---");
                System.out.println("1. Add Employee");
                System.out.println("2. Display");
                System.out.println("3. Search by Name");
                System.out.println("4. Delete by ID");
                System.out.println("5. Update Salary");
                System.out.println("6. Sort by Salary");
                System.out.println("0. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double sal = sc.nextDouble();

                        list.addEmployee(id, name, sal);
                        break;

                    case 2:
                        list.display();
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.print("Enter name: ");
                        String sname = sc.nextLine();
                        list.searchByName(sname);
                        break;

                    case 4:
                        System.out.print("Enter ID: ");
                        int did = sc.nextInt();
                        list.deleteById(did);
                        break;

                    case 5:
                        System.out.print("Enter ID: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter new salary: ");
                        double ns = sc.nextDouble();
                        list.updateSalary(uid, ns);
                        break;

                    case 6:
                        list.sortBySalary();
                        break;

                    case 0:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 0);

            sc.close();
        }
    }

    