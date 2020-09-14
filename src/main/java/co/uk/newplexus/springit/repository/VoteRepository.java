package co.uk.newplexus.springit.repository;

import co.uk.newplexus.springit.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
