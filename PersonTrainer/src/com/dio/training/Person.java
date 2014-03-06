package com.dio.training;

/**
 * Created by Виталий Сагайдак on 27.02.14.
 */
public class Person {
    private final Position role;
    private final int age;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    public Position getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Person)  {
            if (((Person) obj).getAge() != this.age) return false;
            if (((Person) obj).getRole() != this.role) return false;
            if (!((Person) obj).getFirstName().equals( this.firstName)) return false;
            if (!((Person) obj).getLastName().equals( this.lastName)) return false;
            if (!((Person) obj).getEmail().equals( this.email)) return false;
            if (!((Person) obj).getPhone().equals( this.phone)) return false;

            return true;
        }

            return false;
    }

    @Override
    public int hashCode() {
        int salt =42;

        return (role.hashCode()+ age+firstName.hashCode() +lastName.hashCode()+
                email.hashCode()+phone.hashCode()+role.hashCode() +salt+
            super.hashCode());
    }

    @Override
    public String toString() {
        return "["+firstName +" " + lastName+ " age:"+age +" email:"+email +" phone:"+ phone +"]";
    }

    private Person(Builder builder) {
      this.age = builder.age;
      this.role =builder.role;
      this.firstName = builder.firstName;
      this.lastName = builder.lastName;
      this.email = builder.email;
     this.phone = builder.phone;
    }

    public static class Builder {

        private Position role;
        private int age;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;

        public Builder() {}

        public Builder(Person original) {

            this.role = original.role;
            this.age = original.age;
            this.firstName = original.firstName;
            this.lastName = original.lastName;
            this.email = original.email;
            this.phone = original.phone;
        }

        public Builder role(Position role) {

            this.role = role;
            return this;
        }

        public Builder age(int age) {

            this.age = age;
            return this;
        }

        public Builder firstName(String firstName) {

            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {

            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {

            this.email = email;
            return this;
        }

        public Builder phone(String phone) {

            this.phone = phone;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

}
