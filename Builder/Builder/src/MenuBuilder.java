public class MenuBuilder {

    public Menu createMenu(String combo){
        Menu menu= new Menu();

        if(combo.equalsIgnoreCase("combo-1")){
            menu.items.add(new Soda());
            menu.items.add(new Burger());
            menu.items.add(new Fries());
        }
        if(combo.equalsIgnoreCase("combo-2")){
            menu.items.add(new Soda());
            menu.items.add(new Nuggets());
            menu.items.add(new Fries());
        }
        if(combo.equalsIgnoreCase("combo-3")){
            menu.items.add(new Nuggets());
            menu.items.add(new Fries());
        }
        if(combo.equalsIgnoreCase("combo-4")){
            menu.items.add(new Soda());
            menu.items.add(new Nuggets());
        }
        if(combo.equalsIgnoreCase("combo-5")){
            menu.items.add(new Burger());
            menu.items.add(new Fries());
        }
        if(combo.equalsIgnoreCase("combo-6")){
            menu.items.add(new Soda());
            menu.items.add(new Burger());
        }

        return menu;
    }
}
