package co.uk.newplexus.springit.repository;

import co.uk.newplexus.springit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
