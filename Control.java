class Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your exam score (0-100): ");
        int score = scanner.nextInt();
        
        // 1. Simple 'if' statement
        if (score < 0 || score > 100) {
            System.out.println("Invalid score entered!");
        }
        
        // 2. 'if-else' statement
        if (score >= 50) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
        
        // 3. 'if-else-if' ladder
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 75) {
            grade = 'B';
        } else if (score >= 50) {
grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
        
        // 4. 'switch-case' statement
        switch (grade) {
            case 'A':
                System.out.println("Excellent work!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Satisfactory performance.");
                break;
            case 'F':
                System.out.println("Needs improvement.");
                break;
            default:
                System.out.println("No remarks available.");
        }
        
        scanner.close();
    }
}
