package shop;

import instuments.classes.Type;
import instuments.instrumentabstact.Instrument;

import java.util.*;

public class Shop {
    private double shopWallet;
    private final HashMap<Instrument, Integer> listOfInstruments;
    private final TreeMap<Integer,ArrayList<Instrument>> soldInstruments = new TreeMap<>();

    public Shop() {
        this.shopWallet = 0;
        this.listOfInstruments = new HashMap<>();
    }

    public void buyInstrument(Instrument instrument, int quantity) {
        if (listOfInstruments.containsKey(instrument) && listOfInstruments.get(instrument) >= quantity && instrument.isAvailable()) {
            listOfInstruments.put(instrument, (listOfInstruments.get(instrument) - quantity));
            shopWallet = shopWallet + (quantity * instrument.getPrice());

        } else if (!listOfInstruments.containsKey(instrument) || listOfInstruments.get(instrument) <= 0 || quantity > listOfInstruments.get(instrument)) {
            instrument.setAvailable(false);
            System.out.println("Няма налични бройки");
        }

    }

    public void addInstrument(Instrument instrument, int quantity) {
        if (!listOfInstruments.containsKey(instrument) && quantity > 0) {
            listOfInstruments.put(instrument, quantity);
            instrument.setAvailable(true);
        }else{
            listOfInstruments.put(instrument, listOfInstruments.get(instrument) + quantity);
            instrument.setAvailable(true);
        }
    }

    public void getListOfInstruments() {
        for (Map.Entry<Instrument, Integer> instrumentIntegerEntry : listOfInstruments.entrySet()) {
            System.out.println(instrumentIntegerEntry.getKey().getInstrumentName() + " " + instrumentIntegerEntry.getValue());
        }
    }

    public double getShopWallet() {
        return shopWallet;
    }

    public void getInstrumentsByAlphabet() {
        TreeMap<Character, TreeSet<Instrument>> sorted = new TreeMap<>();
        for (Instrument instrument : listOfInstruments.keySet()) {
            if (!sorted.containsKey(instrument.getInstrumentName().charAt(0))) {
                sorted.put(instrument.getInstrumentName().charAt(0), new TreeSet<>((i1,i2)-> i1.getInstrumentName().compareTo(i2.getInstrumentName())));
                sorted.get(instrument.getInstrumentName().charAt(0)).add(instrument);
            } else {
                sorted.get(instrument.getInstrumentName().charAt(0)).add(instrument);
            }

        }
        for (Map.Entry<Character, TreeSet<Instrument>> stringArrayListEntry : sorted.entrySet()) {

            System.out.println("With " + stringArrayListEntry.getKey());
            stringArrayListEntry.getValue().forEach((k) -> {
                System.out.println(k.getInstrumentName());
            });
        }
    }

    public void showSoldInstruments(){
        for (Map.Entry<Instrument, Integer> entry : listOfInstruments.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }

    public void getInstrumentByPrice() {
        TreeMap<Double, ArrayList<Instrument>> sorted = new TreeMap<>();
        for (Instrument instrument : listOfInstruments.keySet()) {
            if (!sorted.containsKey(instrument.getPrice())) {
                sorted.put(instrument.getPrice(), new ArrayList<>());
                sorted.get(instrument.getPrice()).add(instrument);
            } else {
                sorted.get(instrument.getPrice()).add(instrument);
            }
        }
        for (Map.Entry<Double, ArrayList<Instrument>> stringArrayListEntry : sorted.entrySet()) {

            System.out.println("Price of " + stringArrayListEntry.getKey());
            stringArrayListEntry.getValue().forEach((k) -> {
                System.out.println(k.getInstrumentName());
            });
        }
        System.out.println("hello world");
    }

    public void getByType(){
        HashMap<Type,ArrayList<Instrument>> byType = new HashMap<>();
        for (Map.Entry<Instrument, Integer> instrumentIntegerEntry : listOfInstruments.entrySet()) {
            if (instrumentIntegerEntry.getValue() > 0){

            }
        }
    }



}
