package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdRepository extends JpaRepository<Ad, Long> {

    Ad findByTitle(String title); //select * from ads where title = :title

    @Query(nativeQuery = true, value="SELECT  * FROM  ads Where title like :term%")
    List<Ad> findByTitleLike(@Param("term") String term);

}
