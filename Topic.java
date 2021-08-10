import java.io.*;
import java.util.Scanner;

public class Topic extends Answer {

    Scanner in = new Scanner(System.in);
    String user, pass;
    int choice;

    ///////////////////////////////////////////////C++/////////////////////////////////////////////////////////////////

    protected void C_Menu() throws IOException {
        System.out.println("\n\n\n\n");
        System.out.println("\t __________________________________________");
        System.out.println("\t|                C++ TOPICS                |");
        System.out.println("\t|__________________________________________|\n\n");

        System.out.println("\t\t 1] BASIC CONCEPT OF C++ ");
        System.out.println("\t\t 2] DATA TYPES");
        System.out.println("\t\t 3] ARITHMETIC OPERATORS");
        System.out.println("\t\t 4] STRING");
        System.out.println("\t\t 5] ARRAY");
        System.out.println("\t\t 6] FUNCTION");
        System.out.println("\t\t 7] ENCAPSULATION");
        System.out.println("\t\t 8] ABSTRACTION");
        System.out.println("\t\t 9] INHERITANCE");
        System.out.println("\t\t 10] POLYMORPHISM ");
        System.out.println("\t\t 11] BACK ");
        System.out.println("\t\t 12] EXIT ");
        System.out.println("\t\t 13] JUMP TO JAVA ! \n");


        System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print(" ENTER YOUR CHOICE :-- ");


        choice = in.nextInt();
        switch (choice) {
            case 1:
                try {
                    c_basic_concept();
                    c_basic_giveans();
                    c_basic_subans();
                } catch (Exception e) {
                    System.out.println();
                }

                try {
                    c_basic_concept_marks();
                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;

            case 2:
                try {
                    c_data_types();
                    c_data_giveans();
                    c_data_subans();
                } catch (Exception e) {
                    System.out.println();
                }
                try {
                    c_data_marks();
                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;
            case 3:
                try {
                    c_arithmetic_operator();
                    c_arith_giveans();
                    c_arith_subans();
                } catch (Exception e) {
                    System.out.println();
                }
                try {
                    c_arithmatic_marks();
                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;
            case 4:
                try {
                    c_string();
                    c_string_giveans();
                    c_string_subans();
                } catch (Exception e) {
                    System.out.println();
                }
                try {
                    c_string_marks();
                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;
            case 5:
                try {
                    c_array();
                    c_array_giveans();
                    c_array_subans();

                } catch (Exception e) {
                    System.out.println();
                }
                try {
                    c_aray_marks();

                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;
            case 6:
                try {
                    c_function();
                    c_func_giveans();
                    c_func_subans();

                } catch (Exception e) {
                    System.out.println();
                }
                try {
                    c_function_marks();
                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;
            case 7:
                try {
                    c_encapsulation();
                    c_encap_giveans();
                    c_encap_subans();

                } catch (Exception e) {
                    System.out.println();
                }
                try {
                    c_encapsulation_marks();
                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;
            case 8:
                try {
                    c_abstraction();
                    c_abs_giveans();
                    c_abst_subans();

                } catch (Exception e) {
                    System.out.println();
                }
                try {
                    c_abstraction_marks();
                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;
            case 9:
                try {
                    c_inheritance();
                    c_inherit_giveans();
                    c_inherit_subans();

                } catch (Exception e) {
                    System.out.println();
                }
                try {
                    c_inheritance_marks();
                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;
            case 10:
                try {
                    c_polymorphism();
                    c_poly_giveans();
                    c_poly_subans();

                } catch (Exception e) {
                    System.out.println();
                }
                try {
                    c_polymorphism_marks();
                } catch (Exception e) {
                    System.out.println();
                }
                c_back();
                break;
            case 11:
                Topicmenustart();
                break;
            case 12:
                exit();
                break;
            case 13:
                J_Menu();
                break;
            default:
                System.out.println("\t---------------------------------------------------");
                System.out.println("\t    WRONG INPUT ! PLEASE TRY AGAIN !               ");
                System.out.println("\t---------------------------------------------------");
                C_Menu();
                break;
        }
    }


//**************************************************** JAVA MENU ***********************************************************************//


    protected void J_Menu() throws IOException {
        System.out.println("\t __________________________________________");
        System.out.println("\t|              JAVA TOPICS                 |");
        System.out.println("\t|__________________________________________|\n\n");

        System.out.println("\t\t 1] DATATYPE ");
        System.out.println("\t\t 2] VARIABLE ");
        System.out.println("\t\t 3] CONTROL STATEMENT ");
        System.out.println("\t\t 4] STRING ");
        System.out.println("\t\t 5] CLASS & OBJECT ");
        System.out.println("\t\t 6] ARRAY ");
        System.out.println("\t\t 7] POLYMORPHISM");
        System.out.println("\t\t 8] ABSTRACTION");
        System.out.println("\t\t 9] INHERITANCE");
        System.out.println("\t\t 10] ENCAPSULATION ");
        System.out.println("\t\t 11] BACK \n");
        System.out.println("\t\t 12] EXIT \n");
        System.out.println("\t\t 13] JUMP TO C++ \n");

        System.out.println("\t ----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print(" ENTER YOUR CHOICE :-- ");


        choice = in.nextInt();
        switch (choice) {
            case 1:
                try {
                    j_datatype();
                    j_data_giveans();
                    j_data_subans();

                } catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    j_data_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;
            case 2:
                try {
                    j_variables();
                    j_vari_giveans();
                    j_vari_subans();

                } catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    j_variable_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;

            case 3:
                try {
                    j_controlstatement();
                    j_cont_giveans();
                    j_cont_subans();
                } catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    j_control_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;

            case 4:
                try {
                    j_string();
                    j_str_giveans();
                    j_str_subans();

                } catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    j_string_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;

            case 5:
                try {
                    j_classobject();
                    j_clsob_giveans();
                    j_clasob_subans();

                } catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    j_classobject_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;

            case 6:
                try {
                    j_array();
                    j_array_giveans();
                    j_array_subans();

                } catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    j_aray_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;

            case 7:
                try {
                    j_polymorphism();
                    j_poly_giveans();
                    j_poly_subans();

                } catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    j_polymorphism_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;
            case 8:
                try {
                    j_abstraction();
                    j_abs_giveans();
                    j_abs_subans();

                } catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    j_abstraction_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;
            case 9:
                try {
                    j_inheritance();
                    j_inher_giveans();
                    j_inher_subans();

                } catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    j_inheritance_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;
            case 10:
                try {
                    j_encapsulation();
                    j_encap_giveans();
                    j_encap_subans();

                } catch (Exception e) {
                    System.out.println(e);
                }
                try {
                    j_encapsulation_marks();
                } catch (Exception e) {
                    System.out.println(e);
                }
                j_back();
                break;
            case 11:
                Topicmenustart();
                break;
            case 12:
                exit();
                break;
            case 13:
                C_Menu();
                break;
            default:
                System.out.println("\t---------------------------------------------------");
                System.out.println("\t    WRONG INPUT ! PLEASE TRY AGAIN !               ");
                System.out.println("\t---------------------------------------------------");
                J_Menu();
                break;


        }
    }


////////////////////////*********************************************///////////////////////////////////////////////////////////////


///////////////////////////////////////// ********************* C++ MARKS ****************************///////////////////////////////////////////////////


    protected void c_basic_concept_marks() throws IOException {

        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }

        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");
        printWriter.close();
    }

    protected void c_data_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");

        printWriter.close();


    }

    protected void c_arithmatic_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");

        printWriter.close();

    }

    protected void c_string_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");

        printWriter.close();
    }

    protected void c_aray_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");

        printWriter.close();


    }

    protected void c_function_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        printWriter.println("----------------------------------------------");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");

        printWriter.close();

    }


    protected void c_encapsulation_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");

        printWriter.close();

    }

    protected void c_abstraction_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");

        printWriter.close();

    }

    protected void c_inheritance_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");
        printWriter.close();

    }

    protected void c_polymorphism_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");
        printWriter.close();

    }


    /////*************************************JAVA MARKS ************************************//////


    protected void j_data_marks() throws IOException {

        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }

        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");
        printWriter.close();
    }

    protected void j_variable_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");
        printWriter.close();


    }

    protected void j_control_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");
        printWriter.close();

    }

    protected void j_string_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");
        printWriter.close();
    }

    protected void j_aray_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");
        printWriter.close();


    }

    protected void j_classobject_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t           ** MARKS ADDED **                ");
        System.out.println("\t ___________________________________________");
        printWriter.close();

    }


    protected void j_polymorphism_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("---------------------------------------------\n");
        System.out.println("___________________________________________");
        System.out.println("|          ** MARKS ADDED **              |");
        System.out.println("___________________________________________");
        printWriter.close();

    }

    protected void j_abstraction_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println(" ___________________________________________");
        System.out.println("|           ** MARKS ADDED **              |");
        System.out.println(" ___________________________________________");
        printWriter.close();

    }

    protected void j_inheritance_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t|           ** MARKS ADDED **              |");
        System.out.println("\t ___________________________________________");
        printWriter.close();

    }

    protected void j_encapsulation_marks() throws IOException {
        File file = new File("MARKS.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        printWriter.println(user);
        printWriter.println("----------------------------------------------\n");
        System.out.println("\t ___________________________________________");
        System.out.println("\t|           ** MARKS ADDED **              |");
        System.out.println("\t ___________________________________________");
        printWriter.close();


    }


////////////////////////////////********************************////////////////////////////////////////////////////////////////////////////////////


    protected void Topicmenustart() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|                 1] C++                   |");
        System.out.println(" ___________________________________________");
        System.out.println();

        System.out.println(" ___________________________________________");
        System.out.println("|                 2] JAVA                  |");
        System.out.println(" ___________________________________________");
        System.out.println();

        System.out.println(" ___________________________________________");
        System.out.println("|                 3] SHOW MARKS              |");
        System.out.println(" ___________________________________________");
        System.out.println();

        System.out.println(" ___________________________________________");
        System.out.println("|                 4] BACK                  |");
        System.out.println(" ___________________________________________");
        System.out.println();

        System.out.println(" ___________________________________________");
        System.out.println("|                 5] EXIT                  |");
        System.out.println(" ___________________________________________");
        System.out.println();


        System.out.print(" ENTER YOUR CHOICE :-- ");
        choice = in.nextInt();

        if (choice == 1) {
            C_Menu();
        } else if (choice == 2) {
            J_Menu();

        } else if (choice == 3) {
            showmarks();

        } else if (choice == 4) {
            MainStart();

        } else if (choice == 5) {
            exit();
        } else {
            System.out.println("\t---------------------------------------------------");
            System.out.println("\t    WRONG INPUT ! PLEASE TRY AGAIN !               ");
            System.out.println("\t---------------------------------------------------");
            Topicmenustart();
        }

    }


    protected void showmarks() throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("\t ___________________________________________");
        System.out.println("\t           PROVIDE YOUR USERNAME            ");
        System.out.println("\t ___________________________________________");
        String user = in.nextLine();
        System.out.println("\t ___________________________________________");
        System.out.println("\t           PROVIDE YOUR PASSCODE            ");
        System.out.println("\t ___________________________________________");
        String passs = in.nextLine();
        String path = "LOG.txt";
        File file = new File(path);
        try {

            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] value = line.split(" ");
                if (value[0].equals(user)) {
                    if (value[1].equals(passs)) {
                        System.out.println("\t ___________________________________________");
                        System.out.println("\t           SUCCESSFULLY LOG IN !            ");
                        System.out.println("\t ___________________________________________");
                        System.out.println("");
                        try {
                            File file2 = new File("MARKS.txt");
                            Scanner in2 = new Scanner(file2);
                            while (in2.hasNext()) {
                                String topic = in2.nextLine();
                                String mark = in2.nextLine();
                                String name = in2.nextLine();
                                line = in2.next();
                                if (user.equals(name)) {
                                    System.out.println(" * INFO * \n");
                                    System.out.println("TOPIC NAME :" + topic + "\n" + " MARKS : " + mark + "\n" + "USER NAME :" + name + "\n" + line);
                                } else {
                                    showexit();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println();
                        }


                    }

                }
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

    }



    protected void MainStart() {


        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\t\t\t\t\t  ***************************************************************************");
        System.out.println("\t\t\t\t\t                 ___________________________________________                   ");
        System.out.println("\t\t\t\t\t |              |                                           |                |");
        System.out.println("\t\t\t\t\t |              |                                           |                |");
        System.out.println("\t\t\t\t\t |              |        WELCOME   TO  QUIZ    APP          |                |");
        System.out.println("\t\t\t\t\t |              |                                           |                |");
        System.out.println("\t\t\t\t\t |              |___________________________________________|                |\n");
        System.out.println("\t\t\t\t\t  ****************************************************************************");


        System.out.println("\n");
        System.out.println(" WANT TO TEST YOURSELF    ??? \n");
        System.out.println(" CREATE ACCOUNT         =  1");
        System.out.println(" HAVE AN ACCOUNT PRESS  =  2");
        System.out.println(" SHOW MARK              =  3 ");
        System.out.println(" EXIT                   =  4 \n");

        System.out.println(" ******************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ******************************************************************************************************************************************************************************************************************************************************************************************************************************************************\n");
        Mainmenu();

    }


    protected void Mainmenu() {
        System.out.print(" ENTER YOUR CHOICE :-- ");

        choice = in.nextInt();
        if (choice == 1) {
            try {
                write();
                Topicmenustart();
            } catch (Exception e) {
                System.out.println(e);

            }
        } else if (choice == 2) {
            try {
                read();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (choice == 3) {
            try {
                showmarks();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (choice == 4) {
            exit();
        } else {
            System.out.println("\t--------------------------------------------");
            System.out.println("\t    WRONG INPUT ! PLEASE TRY AGAIN !        ");
            System.out.println("\t--------------------------------------------");
            Mainmenu();
        }

    }


    protected void write() throws IOException {

        Scanner in = new Scanner(System.in);
        File file = new File("LOG.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("\n");
        } else {
            System.out.println("\n");
        }
        System.out.println("\t ___________________________________________");
        System.out.println("\t             GIVE A SINGLE USERNAME :       ");
        System.out.println("\t ___________________________________________");


        printWriter.print(user =in.next());
        System.out.println("\t ___________________________________________");
        System.out.println("\t             GIVE A PASSCODE :              ");
        System.out.println("\t ___________________________________________");


        printWriter.print(pass =" "+in.next()+ "\r\n");

        System.out.println("\n\n\n\n");
        System.out.println("\t  _________________________________________");
        System.out.println("\t |      **** ACCOUNT CREATED ****          |");
        System.out.println("\t |_________________________________________|");
        System.out.println("\n\n");
        printWriter.close();
        writeexit();


        }




        void writeexit() throws IOException {

        System.out.println("\n\n");
        System.out.println("\t  _________________________________________");
        System.out.println("\t |       MENU ? PRESS \" M \"              |");
        System.out.println("\t |       EXIT ? PRESS \" E \"              |");
        System.out.println("\t |       GO BACK ? PRESS \"B\"             |");
        System.out.println("\t |_________________________________________|");
        System.out.println("\n\n");
        String p;
        p = in.next();
        if (p.equals("M") || p.equals("m")) {
            Topicmenustart();
        }
        else if (p.equals("e") || p.equals("E")) {
            exit();
                }
        else if (p.equals("B")||p.equals("b")){
            MainStart();
        }else {
            System.out.println("\t-----------------------------------------------");
            System.out.println("\t    WRONG INPUT ! PLEASE TRY AGAIN !           ");
            System.out.println("\t-----------------------------------------------"+"\n\n");
            writeexit();
        }

        }




    protected void read() throws IOException{

        Scanner in = new Scanner(System.in);
        System.out.println("\t ___________________________________________");
        System.out.println("\t           PROVIDE YOUR USERNAME            ");
        System.out.println("\t ___________________________________________");
        String user = in.nextLine();
        System.out.println("\t ___________________________________________");
        System.out.println("\t           PROVIDE YOUR PASSCODE            ");
        System.out.println("\t ___________________________________________");
        String passs = in.nextLine();
        String path = "LOG.txt";
        File file = new File(path);
        try {

            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] value = line.split(" ");
                if (value[0].equals(user)) {
                    if (value[1].equals(passs)) {
                        System.out.println("\t ___________________________________________");
                        System.out.println("\t           SUCCESSFULLY LOG IN !            ");
                        System.out.println("\t ___________________________________________");
                        System.out.println("");
                        writeexit();

                    }

                }
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

    }








    void c_back() throws IOException {
        System.out.println("\n\n");
        System.out.println("\t---------------------------------------------------");
        System.out.println("\t           GO BACK ? PRESS \" B \"                 ");
        System.out.println("\t           EXIT    ? PRESS \" E \"                 ");
        System.out.println("\t---------------------------------------------------");
        String p;
        p = in.next();
        if (p.equals("B") || p.equals("b")) {
            C_Menu();
        } else if (p.equals("E") || p.equals("e")) {
            exit();
        } else {
            System.out.println("\t--------------------------------------------");
            System.out.println("\t    WRONG INPUT ! PLEASE TRY AGAIN !        ");
            System.out.println("\t--------------------------------------------");
            c_back();

        }
    }




    void j_back() throws IOException {
        System.out.println("\n\n");
        System.out.println("\t---------------------------------------------------");
        System.out.println("\t           GO BACK ? PRESS \" B \"                 ");
        System.out.println("\t           EXIT    ? PRESS \" E \"                 ");
        System.out.println("\t---------------------------------------------------");
        String p;
        p = in.next();
        if (p.equals("B") || p.equals("b")) {
            J_Menu();
        } else if (p.equals("E") || p.equals("e")) {
            exit();
        } else {
            System.out.println("\t--------------------------------------------");
            System.out.println("\t    WRONG INPUT ! PLEASE TRY AGAIN !        ");
            System.out.println("\t--------------------------------------------");
            j_back();

        }

    }

    void gomenu() throws IOException {
        System.out.println("\t---------------------------------------------------");
        System.out.println("\t           GO TO MENU  ? PRESS \" M \"             ");
        System.out.println("\t            EXIT       ? PRESS \" E \"             ");
        System.out.println("\t---------------------------------------------------");
        String p;
        p = in.next();
        if (p.equals("M") || p.equals("m")) {
            Topicmenustart();
        } else if (p.equals("E") || p.equals("e")) {
            exit();
        } else {
            System.out.println("\t--------------------------------------------");
            System.out.println("\t    WRONG INPUT ! PLEASE TRY AGAIN !        ");
            System.out.println("\t--------------------------------------------");
            gomenu();

        }
    }

    void showexit() {
        System.out.println("\t-----------------------------------------------");
        System.out.println("\t GO BACK ? PRESS \" B \" EXIT ? PRESS \"E\"    ");
        System.out.println("\t-----------------------------------------------");
        String p;
        p = in.next();
        if (p.equals("b") || p.equals("B")) {
            MainStart();
        } else if (p.equals("e") || p.equals("E")) {
            exit();
        } else {
            showexit();
        }
    }


            void showlogexit() throws IOException {
                System.out.println("\t-------------------------------------------------------------------------");
                System.out.println("\t            WRONG ID & PASSCODE ! PLEASE TRY AGAIN !                     ");
                System.out.println("\t   GO BACK ? PRESS \" B \" EXIT ? PRESS \"E\"   TRY AGAIN ? PRESS \" T \"");
                System.out.println("\t-------------------------------------------------------------------------");
                String p;
                p = in.next();
                if (p.equals("b") || p.equals("B")) {
                    MainStart();
                } else if (p.equals("e") || p.equals("E")) {
                    exit();
                } else if(p.equals("T")|| p.equals("t")) {
                    showmarks();
                }else {
                    showlogexit();
                }

            }
}
