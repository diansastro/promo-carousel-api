package gHost.promocarouselapi.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "userModule")
@EntityListeners(AuditingEntityListener.class)
public class UserModule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "order", nullable = false)
    private Integer order;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Module getModule() {
        return module;
    }


}
