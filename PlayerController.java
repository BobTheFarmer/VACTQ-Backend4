import org.springframework.web.bind.annotation.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collection;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private ConcurrentHashMap<String, Player> players = new ConcurrentHashMap<>();

    @PostMapping
    public Player create(@RequestBody Player player) {
        players.put(player.getUid(), player);
        return player;
    }

    @GetMapping
    public Collection<Player> getAll() {
        return players.values();
    }

    @PutMapping("/{uid}")
    public Player update(@PathVariable String uid, @RequestBody Player playerDetails) {
        Player player = players.get(uid);
        // update player details
        player.setName(playerDetails.getName());
        player.setUid(playerDetails.getUid());
        player.setDistance(playerDetails.getDistance());
        return player;
    }

    @DeleteMapping("/{uid}")
    public String delete(@PathVariable String uid) {
        Player removedPlayer = players.remove(uid);
        return removedPlayer != null ? "Player removed" : "Player not found";
    }
}
