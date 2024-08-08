@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }
    // Otros métodos CRUD
}

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile save(Profile profile) {
        return profileRepository.save(profile);
    }
    // Otros métodos CRUD
}
