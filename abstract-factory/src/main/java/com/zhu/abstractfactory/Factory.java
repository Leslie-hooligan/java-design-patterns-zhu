package com.zhu.abstractfactory;

/**
 * @author Zhu Junchao
 * @create 2023/7/22 23:29 周六
 */
public class Factory {
    public   enum BlacksmithType{
        ELF,ORC;
    }

    public static Blacksmith createBlacksmith(BlacksmithType blacksmithType){
        switch (blacksmithType){
            case ELF:
                return new ElfBlacksmith();
            case ORC:
                return new OrcBlacksmith();
        }
        return null;
    }

}
