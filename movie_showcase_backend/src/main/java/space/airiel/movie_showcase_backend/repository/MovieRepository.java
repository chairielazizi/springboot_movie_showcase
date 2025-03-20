package space.airiel.movie_showcase_backend.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import space.airiel.movie_showcase_backend.entity.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
