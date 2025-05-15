//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
    System.out.println( "dog " + dog);
    System.out.println ("cat " + cat);
    System.out.println ("paper " + paper);

    dog = dog + 4;
    cat = cat + 4;
    paper = paper + 4;
    System.out.println ("dog " + dog);
    System.out.println ("cat " + cat);
    System.out.println ("paper " + paper);

    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;
    System.out.println ("dog " + dog);
    System.out.println ("cat " + cat);
    System.out.println ("paper " + paper);

    var friend = 19;
    System.out.println ("friend " +friend);
    friend = friend +2;
System.out.println ("friend" + friend);

friend = friend /7;
System.out.println ("friend " + friend );

var frog = 3.5;
System.out.println ("frog " + frog);
frog = frog * 10;
System.out.println ("frog " + frog );
frog = frog / 3.5;
System.out.println ("frog " + frog );
frog = frog + 4;
System.out.println ("frog " + frog );

var boxer1Weight = 78.2;
var boxer2Weight = 82.7;
var totalWeight = boxer1Weight + boxer2Weight;
System.out.println ("totalWeight " + totalWeight );

var weightDifference = boxer2Weight - boxer1Weight;
System.out.println ("weightDifference " + weightDifference );

var remainder = boxer2Weight % boxer1Weight;
System.out.println ("remainder " + remainder );

var totalHours = 640;
var hoursPerEmployee = 8;

var numberOfEmployees = totalHours / hoursPerEmployee;
System.out.println ("numberOfEmployees " + numberOfEmployees + " " );
}
}