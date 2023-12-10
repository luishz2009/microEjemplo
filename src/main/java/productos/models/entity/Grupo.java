@Entity
@Table(name = "grupos")
@Setter
@Getter
public class Grupo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String grupo;
    private String producto;
}