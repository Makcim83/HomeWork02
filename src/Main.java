import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        //WomeWork Part 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);
        //WomeWork Part 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);
        //WomeWork Part 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);
        //WomeWork Part 4
        var friend = 19;
        friend += 2;
        friend /= 7;
        System.out.println("Friend = " + friend);
        //WomeWork Part 5
        var frog = 3.5;
        System.out.println("Frog = " + frog);
        frog *= 10;
        System.out.println("Frog = " + frog);
        frog /= 3.5;
        System.out.println("Frog = " + frog);
        frog += 4;
        System.out.println("Frog = " + frog);
        //WomeWork Part 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        double amountWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Amount boxers weight is " + amountWeight + " kg");
        double differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Difference boxers weight is " + differenceWeight + " kg (2-1)");
        differenceWeight = abs(firstBoxerWeight - secondBoxerWeight);
        System.out.println("Difference boxers weight is " + differenceWeight + " kg (abs(1-2))");
        //WomeWork Part 7
        differenceWeight = (max(firstBoxerWeight, secondBoxerWeight) - min(firstBoxerWeight, secondBoxerWeight));
        System.out.println("Difference boxers weight is " + differenceWeight + " kg (max-min)");
        differenceWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Difference boxers weight is " + differenceWeight + " kg (2%1)");
        differenceWeight = max(firstBoxerWeight, secondBoxerWeight) % min(firstBoxerWeight, secondBoxerWeight);
        System.out.println("Difference boxers weight is " + differenceWeight + " kg (max%min)");
        //WomeWork Part 8
        var hoursUntilCompletion = 640;
        var workHoursInDay = 8;
        int workersInCompany = hoursUntilCompletion / workHoursInDay;
        System.out.println(workersInCompany + " работников смогут выполнить объем работ в размее " + hoursUntilCompletion + " часов в течение однго рабочего дня");
        var addedWorkers = 94;
        workersInCompany += addedWorkers;
        hoursUntilCompletion = workersInCompany * workHoursInDay;
        System.out.println("Если в компании работает " + workersInCompany + " челоек, то всего " + hoursUntilCompletion + " часов работы может быть выполнено в течение рабочего дня");

    }
}