package presenter;

import model.GenealogyTree;
import model.HumanComparatorByName;
import model.Service;
import ui.View;

import java.io.IOException;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }
    public void addHuman(String firstName, String lastName, int age){

        service.addHuman(firstName, lastName,age);
    }

    public void getInfo(){
        view.print(service.getInfo());
    }

    public void sortByName(){
        service.sortByName();
    }

    public void sortByAge(){
        service.sortByAge();
    }

    public void save() throws IOException, ClassNotFoundException {
        service.save();
    }
    public void read() throws IOException, ClassNotFoundException {
        service.read();
    }

}
