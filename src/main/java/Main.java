public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "8888 № 888888";
        post.patronymic = "Иванович";
        post.phone = "+79999999999";
        post.surname = "Иванов";
        post.subscription = false;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 03;
        post.birthday.year = 1994;

    }
}
