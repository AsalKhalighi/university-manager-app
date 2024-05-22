public class Admin extends User{
    Admin(String name, String surname, int age, String ID, String email, String phoneNumber, String password) {
        super(name, surname, age, ID);

    }

HomePage homePage = new HomePage();
    public void addNews(String text){
       homePage.getNews().add(text);
        }
    public void removeNews(String text){
        homePage.getNews().removeIf(i -> i == text);
         }
    public void addCourse(){

    }
    public void removeCourse(){

    }
}
