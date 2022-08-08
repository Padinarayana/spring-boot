package in.sunera.Repsoitory;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunera.binding.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Serializable>{

}
