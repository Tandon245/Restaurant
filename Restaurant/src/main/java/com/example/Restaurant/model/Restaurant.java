package com.example.Restaurant.model;

public class Restaurant {



private int id;
    private  String Name;
    private String Address;
    private int Contact_Number;
    private String Speciality;
    private int Total_Staff;

   


    public Restaurant(int id,String Name, String Address, int Contact_Number, String Speciality, int Total_Staff) {
       this.id=id;
        this.Name = Name;
        this.Address = Address;
        this.Contact_Number = Contact_Number;
        this.Speciality = Speciality;
        this.Total_Staff = Total_Staff;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        Address = Address;
    }

    public int getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(int Contact_Number) {
        Contact_Number = Contact_Number;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String Speciality) {
        Speciality = Speciality;
    }

    public int getTotal_Staff() {
        return Total_Staff;
    }

    public void setTotal_Staff(int Total_Staff) {
        Total_Staff = Total_Staff;
    }





    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Contact_Number=" + Contact_Number +
                ", Speciality='" + Speciality + '\'' +
                ", Total_Staff=" + Total_Staff +

                '}';
    }
}
