package _thi_module_2.Service.impl;

import _thi_module_2.Service.ISavingAccountService;
import common.ReadWriteFile;

import java.util.Scanner;

public class SavingAccountService implements ISavingAccountService {
    private static final String ACCOUNT_PATH = "/Users/nguyentrungkien/Desktop/Module2/FuramaResort/src/_thi_module_2/data/bank_accounts.csv";
    Scanner sc=new Scanner(System.in);
    ReadWriteFile read = new ReadWriteFile();
    ReadWriteFile write = new ReadWriteFile();

    @Override
    public void addNewAccount() {

    }
}
