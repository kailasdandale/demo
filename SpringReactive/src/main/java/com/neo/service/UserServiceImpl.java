package com.neo.service;

import com.neo.dto.UserDto;
import com.neo.eitity.User;
import com.neo.exception.UserNotFoundException;
import com.neo.repositorys.UserRepsitory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepsitory userRepsitory;

	public Flux<UserDto> getAllUsers() {

		return userRepsitory.findAll()
				.filter(e -> e.is_active() == true)
				.map(UserDto::entityToDto);


	}

	public Mono<UserDto> updateUser(int id, User userDto) {

		log.info("in update service");
		return userRepsitory.findById(id).flatMap(user -> {
			user.setFirstName(Objects.nonNull(userDto.getFirstName()) ? userDto.getFirstName() : user.getFirstName());
			user.setUpdate_date(LocalDateTime.now());
			user.setLastName(Objects.nonNull(userDto.getLastName()) ? userDto.getLastName() : user.getLastName());
			user.setAge(Objects.nonNull(userDto.getAge()) ? userDto.getAge() : user.getAge());
			user.setEmail(Objects.nonNull(userDto.getEmail()) ? userDto.getEmail() : user.getEmail());
			return userRepsitory.save(user).map(UserDto::entityToDto);
		}).

				switchIfEmpty(createUser(userDto));
	}

	public Mono<UserDto> createUser(User user) {
		log.info("in service" + user);

		user.set_active(true);
		user.setCreate_date(LocalDateTime.now());
		user.setUpdate_date(LocalDateTime.now());
		return userRepsitory.save(user).map(UserDto::entityToDto);
	}

	public Mono<User> getUser(int id) {

		return userRepsitory.findById(id).filter(e -> e.is_active() == true)
				.switchIfEmpty(Mono.error(new UserNotFoundException("Data not present in database  !! " + id)));
	}

	public Mono<Void> deleteById(int id) {
		return userRepsitory.deleteById(id);

	}

	public Mono<UserDto> activateUser(int id, User userDto) {

		return userRepsitory.findById(id).flatMap(user -> {

			user.set_active(userDto.is_active() == true);
			// user.setUpdate_date(LocalDateTime.now());
			user.setFirstName(Objects.nonNull(userDto.getFirstName()) ? userDto.getFirstName() : user.getFirstName());
			user.setLastName(Objects.nonNull(userDto.getLastName()) ? userDto.getLastName() : user.getLastName());
			user.setAge(Objects.nonNull(userDto.getAge()) ? userDto.getAge() : user.getAge());
			user.setEmail(Objects.nonNull(userDto.getEmail()) ? userDto.getEmail() : user.getEmail());
			return userRepsitory.save(user).map(UserDto::entityToDto);

		}).switchIfEmpty(Mono.error(new UserNotFoundException("User not preset by :- " + id)));
	}

	public Mono<Void> deleteByFirstName(String firstName) {
		return userRepsitory.deleteByFirstName(firstName)
				.switchIfEmpty(Mono.error(new UserNotFoundException("User not found !! " + firstName)));

	}

	@Override
	public Mono<UserDto> getDataById(int id) {

		return userRepsitory.findById(id).map(UserDto::entityToDto);

	}

	private void test() {

		Flux<String> just = Flux.just("abc", "xyz", "lmo");
		Flux<String> just1 = Flux.just("abc1", "xyz2", "lmo3");

		just.map(s -> {
			System.out.println(s);
			return s;
		});

		Mono<List<String>> listMono = just.collectList();
		Mono<List<String>> listMono1 = just1.collectList();

//		Mono.zip(listMono, listMono1)
//				.flatMap(tuple-> {
//					List<String> t1 = tuple.getT1();
//					List<String> t2 = tuple.getT2();
//
//					Flux<String> stringFlux = Flux.fromIterable(t1);
//					Stream<String> stream = t1.stream();
//
//					Flux<String> stringFlux1 = Flux.fromStream(stream);
//
//				});
	}

}
