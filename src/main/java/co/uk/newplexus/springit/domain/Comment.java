package co.uk.newplexus.springit.domain;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable{

    @Id
    @Generated
    private long id;
    @NonNull
    private String body;

    @ManyToOne
    private Link link;


}


