use candid::candid_method;   // ✅ import from candid crate
use ic_cdk_macros::*;

#[update]
#[candid_method(update)]
async fn greet(name: String) -> String {
    format!("Hello from CanisterB, {}!", name)
}
