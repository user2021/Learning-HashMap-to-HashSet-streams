package Loans_Packages;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<Mortgage> houses = new ArrayList<>();
        List<Document> terms = new ArrayList<>();

        Map<List<Mortgage>, List<Document>> Loan_Contracts = new HashMap<>();

        Mortgage mortgageObject0 = new Mortgage("WOOD", "15-YR");
        houses.add(mortgageObject0);
        Mortgage mortgageObject1 = new Mortgage("WOOD", "30-YR");
        houses.add(mortgageObject1);
        Mortgage mortgageObject2 = new Mortgage("BRICK", "30-YR");
        houses.add(mortgageObject2);
        Mortgage mortgageObject3 = new Mortgage("BRICK", "15-YR");
        houses.add(mortgageObject3);

        Document loanObject0 = new Document("5A", "Interest_5.0%");
        terms.add(loanObject0);
        Document loanObject1 = new Document("5B", "Interest_3.5%");
        terms.add(loanObject1);
        Document loanObject2 = new Document("5C", "Interest_3.5%");
        terms.add(loanObject2);
        Document loanObject3 = new Document("5D", "Interest_1.5%");
        terms.add(loanObject3);

        Loan_Contracts.put(houses, terms);
        System.out.println(Loan_Contracts);

        System.out.println();
        System.out.println();

        Map<Mortgage, Document> Loan_Contracts_II = IntStream.range(0, houses.size())
                .mapToObj(i -> Map.entry(houses.get(i), terms.get(i)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Loan_Contracts_II.entrySet().stream()
                .collect(Collectors.groupingBy(e -> e.getKey().getM_type(),
                        Collectors.minBy(Comparator.comparing(e -> e.getValue().getM_rate()))
                ))
                .forEach((k, v) -> System.out.printf("type=%s, %s%n", k, v.map(Map.Entry::getValue).orElse(null)));

        
       Map<String,String> mapStringString = Loan_Contracts_II.entrySet().stream()
                .collect(Collectors.groupingBy(e -> e.getKey().getM_type(),
                        Collectors.minBy(Comparator.comparing(e -> e.getValue().getM_rate()))
                )).put(key, e-> e.getValue().getM_rate());
               
//                .forEach((k, v) -> System.out.printf("type=%s, %s%n", k, v.map(Map.Entry::getValue).orElse(null)));
 
        
        
//                .forEach((k, v) -> System.out.printf("type=%s, %s%n",k, v.map(Map.Entry::getValue).orElse(null)));
        System.out.println();
        System.out.println();
        System.out.println();

//        Map<String, String> filteredHouses = Loan_Contracts.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue())
//                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().get(0)));
        //.sorted(Map.Entry.comparingByKey())
    }

}
