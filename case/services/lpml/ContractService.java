package services.lpml;

import models.Contract;
import repository.ContractRepository;
import repository.IContractRepository;
import services.IContactService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ContractService implements IContactService {
    static IContractRepository contractRepository = new ContractRepository();
    static TreeSet<Contract> contractsList = contractRepository.displayListContracts();
    Scanner scanner = new Scanner(System.in);

    public int checkValue(int contractNumber) {
        ArrayList<Contract> arrayList = new ArrayList<>();
        arrayList.addAll(contractsList);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (contractNumber == arrayList.get(i).getContractNumber()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void editContract(int contractNumber) {
        ArrayList<Contract> arrayList = new ArrayList<>();
        arrayList.addAll(contractsList);
        Contract contract = enterValue();
        int value=checkValue(contractNumber);
        if(value !=-1){
        arrayList.set(value, contract);
        contractsList.clear();
        contractsList.addAll(arrayList);
        }else {
            System.out.println("Không sửa đc");
        }
    }

    public void addRepositoryToFileCsv() {
        contractRepository.updateRepository(contractsList);
    }

    public Contract enterValue() {
        Contract contract = new Contract();
        try {
            System.out.print("Nhập vào số hợp đồng của bạn ");
            int contractNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập vào mã booking ");
            String bookingCode = scanner.nextLine();
            System.out.print("Nhập vào số tiền đã đặt cọc");
            String deposit = scanner.nextLine();
            System.out.print("Nhập tổng số tiền thanh toán ");
            String paymentAmount = scanner.nextLine();
            System.out.print("Nhập mã id của khách hàng");
            String customerId = scanner.nextLine();
            contract = new Contract(contractNumber, bookingCode, deposit, paymentAmount, customerId);
        } catch (Exception e) {
            System.out.println("Bạn nhập sai rồi đừng có để trống v.v ");
        }
        return contract;
    }

    @Override
    public void displayListContracts() {
        for (Contract x : contractsList) {
            System.out.println(x.toString());
        }
    }

    @Override
    public void create() {
        Contract contract = enterValue();
        contractsList.add(contract);

    }
}
