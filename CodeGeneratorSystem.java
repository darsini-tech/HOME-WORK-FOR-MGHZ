
package string;
public class CodeGeneratorSystem {
    public static void main(String[] args) 
    {
        String name = "Prasanth";
        String dept = "Java";
        int year = 2026;

        StringBuilder codeBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            codeBuilder.append(ch);
        }
        codeBuilder.append("-");
        for (int i = 0; i < 3; i++) 
        {
            char ch = dept.charAt(i);
            if (ch >= 'a' && ch <= 'z')
            {
                ch = (char) (ch - 32);
            }
            codeBuilder.append(ch);
        }
        codeBuilder.append("-");
        codeBuilder.append(year);
        System.out.println("Generated Code: " + codeBuilder);
    }
}
