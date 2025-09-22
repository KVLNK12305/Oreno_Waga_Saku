use candid::{candid_method, Principal};
use ic_cdk_macros::*;
use ic_cdk::call::Call;

#[update]
#[candid_method(update)]
async fn call_b(canister_b_id: Principal, name: String) -> String {
    let (result,): (String,) = ic_cdk::call(canister_b_id, "greet", (name,))
        .await
        .expect("Cross-canister call failed");

    format!("CanisterA got response: {}", result)
}

// --- Export Candid interface ---
candid::export_service!();
