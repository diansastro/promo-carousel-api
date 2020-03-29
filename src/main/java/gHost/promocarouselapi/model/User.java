package gHost.promocarouselapi.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "user")
    private Set<UserModule> userModules;

    public void setUserModules(Set<UserModule> userModules) {
        this.userModules = userModules;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserModule> getUserModules() {
        return userModules;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{User" +
                "id=" + id +
                '}';
    }
}
