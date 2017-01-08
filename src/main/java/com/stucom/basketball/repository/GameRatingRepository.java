package com.stucom.basketball.repository;

import com.stucom.basketball.domain.GameRating;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the GameRating entity.
 */
@SuppressWarnings("unused")
public interface GameRatingRepository extends JpaRepository<GameRating,Long> {

    @Query("select gameRating from GameRating gameRating where gameRating.user.login = ?#{principal.username}")
    List<GameRating> findByUserIsCurrentUser();

}
