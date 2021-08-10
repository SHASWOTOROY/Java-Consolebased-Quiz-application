import java.io.*;
import java.util.Scanner;

public class Answer extends Question {


    int sum = 0;
    String press;
    String[] ans = new String[12];
    Scanner in = new Scanner(System.in);



    void exit(){
        System.out.println("\t _______________________________________________");
        System.out.println("\t|        THANK YOU & WISH YOU GOOD LUCK !      |");
        System.out.println("\t|_______________________________________________");

    }



    void c_basic_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }



    void c_basic_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_basic_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_basic_subans();
        }
    }



    void c_basic_write() throws IOException {
        if (ans[0].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] B , 3] C , 4] B , 5] B , 6] A , 7] B , 8] A , 9] B , 10] A , 11] B ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] B , 3] C , 4] B , 5] B , 6] A , 7] B , 8] A , 9] B , 10] A , 11] B ");
        }
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
        printWriter.println("C++_BASIC_CONCEPT");
        printWriter.println(sum + "/12");
        printWriter.close();
    }


    void c_data_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void c_data_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_data_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_data_subans();
        }
    }


    void c_data_write() throws IOException {
        if (ans[0].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] A , 2] C , 3] B , 4] C , 5] A , 6] B , 7] B , 8] A , 9] B , 10] A , 11] C ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] A , 2] C , 3] B , 4] C , 5] A , 6] B , 7] B , 8] A , 9] B , 10] A , 11] C ");

        }

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
        printWriter.println("C++_DATA TYPES");
        printWriter.println(sum + "/12");
        printWriter.close();
    }


    void c_arith_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void c_arith_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_arith_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_arith_subans();
        }
    }

    void c_arith_write() throws IOException {
        if (ans[0].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] C , 1] B , 2] C , 3] C , 4] A , 5] B , 6] C , 7] A , 8] A , 9] B , 10] C , 11] C ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] C , 1] B , 2] C , 3] C , 4] A , 5] B , 6] C , 7] A , 8] A , 9] B , 10] C , 11] C ");

        }
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
        printWriter.println("C++_ARITHMETIC OPERATORS");
        printWriter.println(sum + "/12");
        printWriter.close();

    }

    void c_string_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void c_string_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_string_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_string_subans();
        }
    }

    void c_string_write() throws IOException {


        if (ans[0].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] A , 2] C , 3] A , 4] B , 5] C , 6] B , 7] C , 8] C , 9] C , 10] A , 11] C ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] A , 2] C , 3] A , 4] B , 5] C , 6] B , 7] C , 8] C , 9] C , 10] A , 11] C ");


        }
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
        printWriter.println("C++_STRING");
        printWriter.println(sum + "/12");
        printWriter.close();

    }


    void c_array_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void c_array_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_array_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_array_subans();
        }
    }

    void c_array_write() throws IOException {
        if (ans[0].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("C") || ans[0].equals("C")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] B , 2] A , 3] A , 4] A , 5] A , 6] C , 7] A , 8] B , 9] C , 10] A , 11] C ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] B , 2] A , 3] A , 4] A , 5] A , 6] C , 7] A , 8] B , 9] C , 10] A , 11] C ");
        }
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
        printWriter.println("C++_ARRAY");
        printWriter.println(sum + "/12");
        printWriter.close();

    }


    void c_func_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void c_func_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_function_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_func_subans();
        }
    }

    void c_function_write() throws IOException {
        if (ans[0].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] A , 3] A , 4] B , 5] A , 6] B , 7] B , 8] C , 9] B , 10] B , 11] C ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] A , 3] A , 4] B , 5] A , 6] B , 7] B , 8] C , 9] B , 10] B , 11] C ");


        }
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
        printWriter.println("C++_FUNCTION");
        printWriter.println(sum + "/12");
        printWriter.close();

    }


    void c_encap_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void c_encap_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_encap_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_encap_subans();
        }
    }


    void c_encap_write() throws IOException {
        if (ans[0].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] A , 3] C , 4] A , 5] B , 6] C , 7] A , 8] A , 9] B , 10] A , 11] C ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] A , 3] C , 4] A , 5] B , 6] C , 7] A , 8] A , 9] B , 10] A , 11] C ");


        }
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
        printWriter.println("C++_ENCAPSULATION");
        printWriter.println(sum + "/12");
        printWriter.close();

    }


    void c_abs_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }


    void c_abst_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_abst_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_abst_subans();
        }
    }


    void c_abst_write() throws IOException {
        if (ans[0].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] C , 1] A , 2] B , 3] C , 4] C , 5] A , 6] B , 7] C , 8] B , 9] A , 10] A , 11] C ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] C , 1] A , 2] B , 3] C , 4] C , 5] A , 6] B , 7] C , 8] B , 9] A , 10] A , 11] C ");


        }
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
        printWriter.println("C++_ABSTRACTION");
        printWriter.println(sum + "/12");
        printWriter.close();

    }


    void c_inherit_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void c_inherit_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_inherit_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_inherit_subans();
        }
    }


    void c_inherit_write() throws IOException {
        if (ans[0].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] C , 1] A , 2] B , 3] A , 4] B , 5] C , 6] C , 7] A , 8] A , 9] C , 10] C , 11] C ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] C , 1] A , 2] B , 3] A , 4] B , 5] C , 6] C , 7] A , 8] A , 9] C , 10] C , 11] C ");


        }
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
        printWriter.println("C++_INHERITANCE");
        printWriter.println(sum + "/12");
        printWriter.close();

    }


    void c_poly_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }


    void c_poly_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            c_poly_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            c_poly_subans();
        }
    }


    void c_poly_write() throws IOException {
        if (ans[0].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] C , 3] C , 4] B , 5] B , 6] A , 7] C , 8] C , 9] C , 10] B , 11] C ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] C , 3] C , 4] B , 5] B , 6] A , 7] C , 8] C , 9] C , 10] B , 11] C ");

        }

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
        printWriter.println("C++_POLYMORPHISM");
        printWriter.println(sum + "/12");
        printWriter.close();

    }


    //******************************************************** JAVA ANSWER *********************************************************************** //


    void j_data_giveans() {
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void j_data_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_data_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_data_subans();
        }
    }


    protected void j_data_write() throws IOException {

        if (ans[0].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] B , 1] B , 2] C , 3] B , 4] C , 5] C , 6] C , 7] C , 8] A , 9] B , 10] B , 11] A ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] B , 1] B , 2] C , 3] B , 4] C , 5] C , 6] C , 7] C , 8] A , 9] B , 10] B , 11] A ");

        }

    File file = new File("MARKS.txt");
    FileWriter fileWriter = new FileWriter(file, true);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if(file.exists()==false)

    {
        file.createNewFile();
        System.out.println("\n");
    } else {
        System.out.println("\n");
    }
        printWriter.println("JAVA_DATATYPE");
        printWriter.println(sum +"/12");
        printWriter.close();
}





    void j_vari_giveans(){
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void j_vari_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_vari_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_vari_subans();
        }
    }

        void  j_vari_write() throws IOException {
                if (ans[0].equals("A") || ans[0].equals("a")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[1].equals("A") || ans[0].equals("a")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[2].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[3].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[4].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[5].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[6].equals("A") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[7].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[8].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[9].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[10].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[11].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] A , 1] A , 2] A , 3] A , 4] B , 5] C , 6] A , 7] B , 8] B , 9] C , 10] C , 11] C ");
                } else {
                    sum = sum + 0;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] A , 1] A , 2] A , 3] A , 4] B , 5] C , 6] A , 7] B , 8] B , 9] C , 10] C , 11] C ");

                }

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
            printWriter.println("JAVA_VARIABLE");
            printWriter.println(sum + "/12");
            printWriter.close();

        }


    void j_cont_giveans(){
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void j_cont_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_cont_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_cont_subans();
        }
    }

void  j_cont_write() throws IOException {

                if (ans[0].equals("B") || ans[0].equals("b")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[1].equals("A") || ans[0].equals("a")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[2].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[3].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[4].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[5].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[6].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[7].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[8].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[9].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[10].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[11].equals("A") || ans[0].equals("a")) {
                    sum = sum + 1;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] B , 1] A , 2] A , 3] C , 4] B , 5] B , 6] B , 7] A , 8] C , 9] A , 10] B , 11] A ");
                } else {
                    sum = sum + 0;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] B , 1] A , 2] A , 3] C , 4] B , 5] B , 6] B , 7] A , 8] C , 9] A , 10] B , 11] A ");


                }

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
            printWriter.println("JAVA_CONTROL_STATEMENT");
            printWriter.println(sum + "/12");
            printWriter.close();
        }




    void j_str_giveans(){
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void j_str_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_str_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_str_subans();
        }
    }

  void  j_str_write() throws IOException {

                if (ans[0].equals("B") || ans[0].equals("b")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[1].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[2].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[3].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[4].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[5].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[6].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[7].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[8].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[9].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[10].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[11].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] B , 1] C , 2] B , 3] B , 4] B , 5] A , 6] C , 7] A , 8] C , 9] B , 10] C , 11] C ");
                } else {
                    sum = sum + 0;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] B , 1] C , 2] B , 3] B , 4] B , 5] A , 6] C , 7] A , 8] C , 9] B , 10] C , 11] C ");

                }

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
            printWriter.println("JAVA_STRING");
            printWriter.println(sum + "/12");
            printWriter.close();
        }



    void j_clsob_giveans(){
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }






    void j_clasob_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_clasob_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_clasob_subans();
        }
    }


   void j_clasob_write() throws IOException {



                if (ans[0].equals("B") || ans[0].equals("b")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[1].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[2].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[3].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[4].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[5].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[6].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[7].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[8].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[9].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[10].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[11].equals("B") || ans[0].equals("b")) {
                    sum = sum + 1;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] B , 1] C , 2] C , 3] B , 4] C , 5] C , 6] C , 7] A , 8] A , 9] B , 10] B , 11] B ");
                } else {
                    sum = sum + 0;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] B , 1] C , 2] C , 3] B , 4] C , 5] C , 6] C , 7] A , 8] A , 9] B , 10] B , 11] B ");


                }

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
            printWriter.println("JAVA_CLASS_OBJECTS");
            printWriter.println(sum + "/12");
            printWriter.close();

        }




    void j_array_giveans(){
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }


    void j_array_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_array_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_array_subans();
        }
    }
    void j_array_write() throws IOException {

                if (ans[0].equals("A") || ans[0].equals("a")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[1].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[2].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[3].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[4].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[5].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[6].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[7].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[8].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[9].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[10].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[11].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] A , 3] B , 4] C , 5] B , 6] C , 7] C , 8] A , 9] B , 10] C , 11] C ");
                } else {
                    sum = sum + 0;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] A , 1] C , 2] A , 3] B , 4] C , 5] B , 6] C , 7] C , 8] A , 9] B , 10] C , 11] C ");

                }

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
            printWriter.println("JAVA_ARRAY");
            printWriter.println(sum + "/12");
            printWriter.close();

        }

    void j_poly_giveans(){
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }
    void j_poly_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_poly_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_poly_subans();
        }
    }
     void  j_poly_write() throws IOException {

                if (ans[0].equals("B") || ans[0].equals("b")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[1].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[2].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[3].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[4].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[5].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[6].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[7].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[8].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[9].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[10].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[11].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] B , 1] C , 2] B , 3] C , 4] B , 5] B , 6] B , 7] C , 8] A , 9] C , 10] C , 11] C ");
                } else {
                    sum = sum + 0;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] B , 1] C , 2] B , 3] C , 4] B , 5] B , 6] B , 7] C , 8] A , 9] C , 10] C , 11] C ");


                }

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
            printWriter.println("JAVA_POLYMORPHISM");
            printWriter.println(sum + "/12");
            printWriter.close();

        }




    void j_abs_giveans(){
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }

    void j_abs_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_abs_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_abs_subans();
        }
    }


    void j_abs_write() throws IOException {

                if (ans[0].equals("A") || ans[0].equals("a")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[1].equals("A") || ans[0].equals("a")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[2].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[3].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[4].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[5].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[6].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[7].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[8].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[9].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[10].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[11].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] A , 1] A , 2] C , 3] A , 4] C , 5] A , 6] A , 7] C , 8] C , 9] B , 10] A , 11] C ");
                } else {
                    sum = sum + 0;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] A , 1] A , 2] C , 3] A , 4] C , 5] A , 6] A , 7] C , 8] C , 9] B , 10] A , 11] C ");

                }

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
            printWriter.println("JAVA_ABSTRACTION");
            printWriter.println(sum + "/12");
            printWriter.close();

        }


    void j_inher_giveans(){
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }
    void j_inher_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_inher_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_inher_subans();
        }
    }



    void  j_inher_write() throws IOException {

                if (ans[0].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[1].equals("C") || ans[0].equals("c")) {
                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[2].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[3].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[4].equals("B") || ans[0].equals("b")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[5].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[6].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[7].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[8].equals("A") || ans[0].equals("a")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[9].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[10].equals("C") || ans[0].equals("c")) {

                    sum = sum + 1;
                } else {
                    sum = sum + 0;
                }
                if (ans[11].equals("A") || ans[0].equals("a")) {
                    sum = sum + 1;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] C , 1] C , 2] B , 3] A , 4] B , 5] A , 6] C , 7] A , 8] A , 9] C , 10] C , 11] A ");
                } else {
                    sum = sum + 0;
                    System.out.println(" TOTAL MARKS    : " + sum + "/12");
                    if(sum<8){
                        System.out.println(" STATUS : FAIL ! ");
                    }else {
                        System.out.println(" STATUS : PASS ! ");
                    }
                    System.out.println(" CORRECT ANSWER :  0] C , 1] C , 2] B , 3] A , 4] B , 5] A , 6] C , 7] A , 8] A , 9] C , 10] C , 11] A ");


                }

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
            printWriter.println("JAVA_INHERITANCE");
            printWriter.println(sum + "/12");
            printWriter.close();

        }


    void j_encap_giveans(){
        System.out.println(" ___________________________________________");
        System.out.println("|             GIVE YOUR ANSWER             |");
        System.out.println(" ___________________________________________");
        System.out.println();

        for (int i = 0; i < ans.length; i++) {

            System.out.print(i + "] ANS : ");

            ans[i] = in.next();
        }
    }


    void j_encap_subans() throws IOException {

        System.out.println(" ___________________________________________");
        System.out.println("|    ###   PRESS \" S \" FOR SUBMIT   ###  |");
        System.out.println(" ___________________________________________");
        System.out.println();
        press = in.next();
        if (press.equals("S") || press.equals("s")) {
            j_encap_write();
        } else {
            System.out.println(" ___________________________________________");
            System.out.println("|    ## WRONG INPUT ! TRY AGAIN ##         |");
            System.out.println(" ___________________________________________");
            System.out.println();
            j_encap_subans();
        }
    }

    void  j_encap_write() throws IOException {

        if (ans[0].equals("C") || ans[0].equals("c")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[1].equals("A") || ans[0].equals("a")) {
            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[2].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[3].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[4].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[5].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[6].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[7].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[8].equals("B") || ans[0].equals("b")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[9].equals("A") || ans[0].equals("a")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[10].equals("C") || ans[0].equals("c")) {

            sum = sum + 1;
        } else {
            sum = sum + 0;
        }
        if (ans[11].equals("B") || ans[0].equals("b")) {
            sum = sum + 1;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] C , 1] A , 2] B , 3] B , 4] C , 5] C , 6] A , 7] A , 8] B , 9] A , 10] C , 11] B ");
        } else {
            sum = sum + 0;
            System.out.println(" TOTAL MARKS    : " + sum + "/12");
            if(sum<8){
                System.out.println(" STATUS : FAIL ! ");
            }else {
                System.out.println(" STATUS : PASS ! ");
            }
            System.out.println(" CORRECT ANSWER :  0] C , 1] A , 2] B , 3] B , 4] C , 5] C , 6] A , 7] A , 8] B , 9] A , 10] C , 11] B ");

        }

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
        printWriter.println("C++_ENCAPSULATION");
        printWriter.println(sum + "/12");
        printWriter.close();

    }
}









