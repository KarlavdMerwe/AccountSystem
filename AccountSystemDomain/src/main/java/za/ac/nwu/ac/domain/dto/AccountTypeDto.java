package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import za.ac.nwu.ac.domain.persistence.AccountType;

public class AccountTypeDto implements Serializable {
    private static long serialVersionUID = -5346853206480289868L;

    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    public AccountTypeDto() {
    }

    public AccountTypeDto(String mnemonic, String accountTypeName, LocalDate creationDate)
    {
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountTypeDto(AccountType accountType)
    {
        this.setAccountTypeName(accountType.getAccountTypeName());
        this.setCreationDate(accountType.getCreationDate());
        this.setMnemonic(accountType.getMnemonic());
    }

    public String getMnemonic() { return mnemonic; }

    public void setMnemonic(String mnemonic) { this.mnemonic = mnemonic; }

    public String getAccountTypeName() { return accountTypeName; }

    public void setAccountTypeName(String accountTypeName) { this.accountTypeName = accountTypeName; }

    public LocalDate getCreationDate() { return creationDate; }

    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    public int hashCode() { return Objects.hash(mnemonic, accountTypeName, creationDate); }

}
