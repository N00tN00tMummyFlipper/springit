package co.uk.newplexus.springit.domain;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Link {

    @Id
    @Generated
    private long id;
    @NonNull
    private String title;
    @NonNull
    private String url;


}
