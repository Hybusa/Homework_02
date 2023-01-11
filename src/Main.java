public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var weight1 = 78.2;
        var weight2 = 82.7;

        System.out.println(weight1+weight2);
        System.out.println(weight2-weight1);

        System.out.println(weight2-weight1);
        System.out.println(weight2%weight1);

        var hoursTotal = 640;
        var hourPerson = 8;
        var people = hoursTotal/hourPerson;

        System.out.println("Всего работников в компании — " + people + " человек");

        var newPeople = people + 94;
        var newHoursTotal = hourPerson*newPeople;

        System.out.println("Если в компании работает " + newPeople + " человек, то всего"
                + newHoursTotal + " часов работы может быть поделено между сотрудниками");










    }
}