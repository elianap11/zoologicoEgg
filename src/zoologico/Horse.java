package zoologico;

public class Horse {
    private String name;
    private String breed;
    private String colour;
    private String country;
    private Integer age;

    public Horse() {
    }

    public Horse(String name, String breed, String colour, String country, Integer age) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Horse{" + "name=" + name + ", breed=" + breed + ", colour=" + colour + ", country=" + country + ", age=" + age + '}';
    }
    
}
