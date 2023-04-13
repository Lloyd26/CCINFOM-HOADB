package ccinfom.hoa.repository;

import ccinfom.hoa.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM people ORDER BY peopleid DESC LIMIT :limit")
    List<People> getRecentPeople(@Param("limit") int limit);

    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM people")
    int getTotalCount();
}
