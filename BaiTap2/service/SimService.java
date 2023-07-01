package service;

import model.Sim;
import repository.SimRepository;
import util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class SimService implements ISimService{
    Scanner scanner = new Scanner(System.in);
 private    SimRepository simRepository= new SimRepository();
   private List<Sim> simList=simRepository.displayRepository();
    public  void saveToFile(){
        simRepository.add(simList);
    }
    @Override
    public void display() {
        for (Sim x: simList) {
            System.out.println(x);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name= scanner.nextLine();
        System.out.println("nhập giá");
        String price= scanner.nextLine();
        Sim sim = new Sim(id,name,price);
        simList.add(sim);
    }
public int check(int id){
    for (int i = 0; i <simList.size() ; i++) {
        if(id==simList.get(i).getId()){
            return i;
        }
    }
    return -1;
}
    @Override
    public void delete(int id) {
        int index=check(id);
        if(index!=-1){
            simList.remove(index);
        }else {
            System.out.println("Không tìm thấy id");
        }
    }

    @Override
    public void edit(int id) {
        int index=check(id);
        if(index!=-1){
            System.out.println("Nhập id ");
            int id1=scanner.nextInt();
            System.out.println("Nhập tên sản phẩm");
            String name= scanner.nextLine();
            System.out.println("nhập giá");
            String price= scanner.nextLine();
            Sim sim = new Sim(id1,name,price);
            simList.set(index,sim);
        }else {
            System.out.println("Ko tim thấy");
        }


    }
}
