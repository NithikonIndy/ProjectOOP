package model;

public class Shop {
    
    public int maxCredit;
    public int initialAntibodyCredit;
    public int antibody1PlacementCost;
    public int antibody2PlacementCost;
    public int antibody3PlacementCost;
    public String type;

    public Shop(){
        this.maxCredit = 9999;
        this.initialAntibodyCredit = 8000;
        this.antibody1PlacementCost = 100;
        this.antibody2PlacementCost = 200;
        this.antibody3PlacementCost = 300;
    }

    public void maxminCheck(){
        if(initialAntibodyCredit >= maxCredit){
           initialAntibodyCredit = maxCredit;
        }else if(initialAntibodyCredit <= 0){
            initialAntibodyCredit = 0;
        }
    }

    public boolean buyCheck(String type){
        switch(type){
            case "antibody1" : 
                if(initialAntibodyCredit >= antibody1PlacementCost){
                    System.out.println("can buy!!!");
                    return true;
                }
            case "antibody2" :
                if(initialAntibodyCredit >= antibody2PlacementCost){
                    System.out.println("can buy!!!");
                    return true;
                }
            case "antibody3" : 
                if(initialAntibodyCredit >= antibody3PlacementCost){
                    System.out.println("can buy!!!");
                    return true;
                }
            default : return false;
        }
    }

    public void buyAntibody1(){
        if(buyCheck("antibody1")){
            initialAntibodyCredit -= antibody1PlacementCost;
            System.out.println("Credit= "+ initialAntibodyCredit);
        }else if(!buyCheck("antibody1")){
            System.out.println("You don't have enough credit!!!");
            System.out.println("Credit= "+ initialAntibodyCredit);
        }
    }
    public void buyAntibody2(){
        if(buyCheck("antibody2")){
            initialAntibodyCredit -= antibody2PlacementCost;
            System.out.println("Credit= "+ initialAntibodyCredit);
        }else if(!buyCheck("antibody2")){
            System.out.println("You don't have enough credit!!!");
            System.out.println("Credit= "+ initialAntibodyCredit);
        }
    }
    public void buyAntibody3(){
        if(buyCheck("antibody3")){
            initialAntibodyCredit -= antibody3PlacementCost;
            System.out.println("Credit= "+ initialAntibodyCredit);
        }else if(!buyCheck("antibody3")){
            System.out.println("You don't have enough credit!!!");
            System.out.println("Credit= "+ initialAntibodyCredit);
        }
    }
}
