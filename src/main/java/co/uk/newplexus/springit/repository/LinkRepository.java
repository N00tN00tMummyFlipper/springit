package co.uk.newplexus.springit.repository;

import co.uk.newplexus.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
