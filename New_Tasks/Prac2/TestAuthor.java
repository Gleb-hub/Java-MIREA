public class TestAuthor{
    public static void main(String[] args) {
        Author test = new Author("Gleb", "email@domain", 'M');
        
        System.out.println(test.toString());
        test.setEmail("new_email@domain");
        System.out.println(test.toString());
    }
}


class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" + 
            "name=" + name + 
            " email=" + email + 
            " gender=" + gender + 
            "}";
    }
}

