package ccinfom.hoa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Entity
@Table(name = "asset_transfer")
public class AssetTransfer {

    @Id
    @Column(name = "asset_id", nullable = false)
    private Integer id;

    @Id
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "schedule_date")
    private Date scheduleDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "asset_id", referencedColumnName = "asset_id", nullable = false),
            @JoinColumn(name = "schedule_date", referencedColumnName = "transaction_date", nullable = false),
    })
    private AssetTransactions assetTransactions;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "act_date")
    private Date actDate;

    @Column(name = "source_lattitude", nullable = false, precision = 7, scale = 4)
    private Double sourceLattitude;

    @Column(name = "source_longitude", nullable = false, precision = 7, scale = 4)
    private Double sourceLongitude;

    @Column(name = "dest_lattitude", nullable = false, precision = 7, scale = 4)
    private Double destLattitude;

    @Column(name = "dest_longitude", nullable = false, precision = 7, scale = 4)
    private Double destLongitude;

    @Column(name = "transfer_cost", precision = 9, scale = 2)
    private Double transferCost;

    @Column(columnDefinition = "ENUM('S', 'O', 'C')", nullable = false)
    @Enumerated(EnumType.STRING)
    private Character status;

    @Column(name = "completename", nullable = false, length = 45)
    private Outsiders completeName;


}
