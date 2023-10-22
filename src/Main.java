public class Main {
    public static void main(String[] args)

    // Задача 1
    { System.out.println( " Задача 1 ");
    int accumulation = 15000;
    int purpose = 2_459_000;
    int total = 0;
    int step = 0;
    while ( total < purpose ) { total = total + accumulation; step ++; }
    System.out.println( " Месяц " + step + " сумма накоплений равна " + total + " рублей " );
    // Задача 2
    { System.out.println( " Задача 2 ");
    int a = 0;
    while ( a < 10 ) { a ++; System.out.print( a + " " ); }
    System.out.println( );
    for ( int b = 10; b >= 1; b -- ) { System.out.print( b + " " ); }
    System.out.println( );
    // Задача 3
    { System.out.println( " Задача 3 ");
    int population = 12_000_000;
    int natality = 17;
    int mortality = 8;
    int populationGrowth = natality - mortality;
    for ( int year = 1; year <= 10; year ++) { population =
    population + population / 1000 * populationGrowth;
    System.out.println( " Год " + year + ", численность населения соответствует " + population );}
    // Задача 4
    { System.out.println( " Задача 4 ");
    double accumulation1 = 15_000;
    double different = 1.07;
    int month = 0;
    while ( accumulation1 < 12_000_000 )
    { accumulation1 = accumulation1 * different; month ++;
    System.out.println( " Месяц " + month + ", сумма накоплений: " + ( int ) accumulation1 );
       }  System.out.println( " Потребуется месяцев " + month );
    // Задача 5
    { System.out.println( " Задача 5 "); }
     accumulation1 = 15_000;
     different = 1.07;
     month = 0;
     while ( accumulation1 < 12_000_000 )
     { accumulation1 = accumulation1 * different; month ++; if ( month % 6 == 0 )
     System.out.println( " Месяц " + month + ", сумма накоплений: " + ( int ) accumulation1 );
     }  System.out.println( " Потребуется месяцев " + month );
    // Задача 6
    { System.out.println( " Задача 6 ");
    accumulation1 = 15_000;
    different = 1.07;
    month = 0;
    while ( month < 12 * 9 )
    { accumulation1 = accumulation1 * different; month ++; if ( month % 6 == 0 )
    System.out.println( " Месяц " + month + ", сумма накоплений: " + ( int ) accumulation1 );
    } }
    // Задача 7
    { System.out.println( " Задача 7 ");
    int friday = 2;
    for ( int i = friday; i <= 31; i = i + 7) {
        System.out.println( " Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет. ");
    } }
    // Задача 8
    { System.out.println( " Задача 8 ");
    for ( int year = 2023 - 200; year <= 2023 + 100; year ++)
    { if ( year % 79 == 0 ) System.out.println( year );}
} } } } } }