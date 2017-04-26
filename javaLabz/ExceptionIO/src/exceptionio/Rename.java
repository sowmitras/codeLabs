/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionio;

import java.io.*;

/**
 *
 * @author surbhi_khare
 */
//6.11
public class Rename {

    public static void main(String args[]) {
        try {
            File dir1 = new File("company");
            dir1.mkdir();
            System.out.println("The existance  of company directory is:" + dir1.isDirectory());

            File file1 = new File(dir1, "EmployeeDetails.txt");
            file1.createNewFile();
            System.out.println("The existance of EmployeeDetail file is:" + file1.isFile());

            File file2 = new File(dir1, "SalaryDetails.txt");
            file2.createNewFile();
            System.out.println("The existance of SalaryDetail file is:" + file2.isFile());
            file2.delete();
            System.out.println("The existance of SalaryDetail file is:" + file2.isFile());
            dir1.delete();

            System.out.println("The existance of company directory is:" + dir1.isDirectory());
            File fileRename = new File(dir1, "IdentityDetail.txt");
            file1.renameTo(fileRename);
            System.out.println("The existance of IdentityDetail file is:" + fileRename.isFile());
            System.out.println("The existance of EmployeeDetail file is:" + file1.isFile());
            
            File dirRename=new File("kogeent");
            dir1.renameTo(dirRename);
            System.out.println("The existane of company direcctory is:"+dir1.isDirectory());
            
            System.out.println("The existance of kogent directory is:"+dirRename.isDirectory());

        } catch (Exception e) {

        }

    }

}
