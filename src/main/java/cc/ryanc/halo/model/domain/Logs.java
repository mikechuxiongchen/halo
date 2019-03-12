package cc.ryanc.halo.model.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 *     操作日志
 * </pre>
 *
 * @author : RYAN0UP
 * @date : 2018/1/19
 */
@Data
@ToString
@Entity
@Table(name = "halo_logs")
@Deprecated
@EntityListeners(AuditingEntityListener.class)
public class Logs implements Serializable {

    private static final long serialVersionUID = -2571815432301283171L;

    /**
     * id
     */
    @Id
    @GeneratedValue
    private Long logId;

    /**
     * 标题
     */
    private String logTitle;

    /**
     * 内容
     */
    private String logContent;

    /**
     * 产生日志的ip
     */
    private String logIp;

    /**
     * 产生的时间
     */
    @CreatedDate
    private Date logCreated;

    public Logs() {
    }

    public Logs(String logTitle, String logContent, String logIp, Date logCreated) {
        this.logTitle = logTitle;
        this.logContent = logContent;
        this.logIp = logIp;
        this.logCreated = logCreated;
    }
}
