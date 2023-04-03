package repository;

import models.Booking;
import models.Contract;
import util.ReadAndWriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.TreeSet;

public class ContractRepository implements IContractRepository{
    private final String PATH_FILE="data\\contract.csv";


    @Override
    public TreeSet<Contract> displayListContracts() {
        TreeSet<Contract> contractList=new TreeSet<>();
        List<String> stringList= ReadAndWriteToFile.readToFile(PATH_FILE);
            int size=stringList.size();
            for (int i = 0; i <size ; i++) {
                String str=stringList.get(i);
                String[] arr=str.split(",");
             Contract contract=new Contract(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4]);
                contractList.add(contract);
            }
            return contractList;
        }

    public void updateRepository(TreeSet<Contract> contract) {
        File file = new File("data\\contract.csv");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Contract x : contract) {
            ReadAndWriteToFile.writeToFile(PATH_FILE, x.getInfoToCsv(), true);

        }
    }
}
