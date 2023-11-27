public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        if (gender != 1084 && gender != 1052) {
            if(gender != 1078 && gender != 1046) {
                throw new IllegalArgumentException("В мире существует 2 пола - это м(мужской) и ж(женский).");
            }
            this.gender = 1078;
        }else {
            this.gender = 1084;
        }
    } // :(
    public String getName(){return this.name;}
    public String getEmail(){return this.email;}
    public char getGender(){return this.gender;}
    public void setEmail(String email){this.email = email;}  // геттеры/сеттеры для мозга слабенького питониста дались тяжело :(
    public String toString(){return this.name + '(' + this.gender + ')' + this.email;}
}

