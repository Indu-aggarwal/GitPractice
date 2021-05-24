import java.util.*;

public class TestJava {

        private Map<String, TreeSet<Integer>> crimeTable = new TreeMap<>();
        private static Map<String, TreeSet<Integer>> partOfCrimeTable = new TreeMap<>();
        private ArrayList<List<Integer>> crimeCodeList = new ArrayList<>();

        static{
            partOfCrimeTable.put("Little Newark", new TreeSet<>(Arrays.asList(8, 77, 93)));
            partOfCrimeTable.put("Springfield Heights", new TreeSet<>(Arrays.asList(8, 14, 15, 31, 33, 47, 77)));
            partOfCrimeTable.put("Squidport", new TreeSet<>(Arrays.asList(5, 8, 14, 27, 31, 47, 93)));
            partOfCrimeTable.put("Waterfront", new TreeSet<>(Arrays.asList(2)));
            //partOfCrimeTable.put("water", new TreeSet(55));
        }

        TestJava(){
            crimeTable.putAll(partOfCrimeTable);
        }
        public ArrayList<List<Integer>> crimeList(){
            List<List<Integer>> var = new ArrayList<>();
            for (Map.Entry<String, TreeSet<Integer>> listOfCrimeCodesMap : crimeTable.entrySet()){
                var.add(new ArrayList(Arrays.asList(listOfCrimeCodesMap.getValue())));


                //crimeCodeList.add(new ArrayList(Arrays.asList(listOfCrimeCodesMap.getValue())));
                //crimeCodeList.add(listOfCrimeCodesMap.getValue());
                //crimeCodeList.add((Arrays.asList(listOfCrimeCodesMap.getValue())));
                //System.out.println(listOfCrimeCodesMap.getValue());

            }
            crimeCodeList.addAll(var);
            System.out.println(crimeCodeList);
            return crimeCodeList;

        }
        //Set<Set<Integer>>
        public void highlyLocalisedCrimeTypes(String districtName){


        }
    }


