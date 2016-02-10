package Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "player")
@NamedQuery(name = "PlayerEntity.getAll",query = "select p from PlayerEntity p")
public class PlayerEntity implements Serializable{

    private long id;
    private String fio;
    private String position;
    private int age;
    private String country;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fio", nullable = false, insertable = true, updatable = true, length = 20)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Basic
    @Column(name = "country", nullable = false, insertable = true, updatable = true, length = 20)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerEntity that = (PlayerEntity) o;

        if (id != that.id) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (fio != null ? !fio.equals(that.fio) : that.fio != null) return false;

        return true;
    }
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + fio + '\'' +
                ", releaseDate=" + country +"}";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
