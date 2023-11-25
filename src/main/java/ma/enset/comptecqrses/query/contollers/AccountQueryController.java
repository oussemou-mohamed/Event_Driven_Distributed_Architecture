package ma.enset.comptecqrses.query.contollers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.comptecqrses.query.entities.Account;
import ma.enset.comptecqrses.common_api.queries.GetAllAccountsQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/query/accounts")
@AllArgsConstructor
@Slf4j
public class AccountQueryController {
    private QueryGateway queryGateway;

@GetMapping("/allAccounts")
    public List<Account> accountList(){
        List<Account> response = queryGateway.query(new GetAllAccountsQuery(), ResponseTypes.multipleInstancesOf(Account.class)).join();

        return response;
    }
}
