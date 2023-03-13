package it.tasgroup.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat")
                .condiments("Lattuce")
                .dressing("Mayo")
                .meat("Turkey")
                .build();

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }

}
