# PlayingWithCoroutines

This repository is only for learning/polishing purposes, it'll have only one branch and code comments will be added as notes.

## CoroutineScope (interface CoroutineScope)
Defines a scope for new coroutines. Every coroutine builder (like launch, async, etc.) is an extension on CoroutineScope and inherits its coroutineContext to automatically propagate all its elements and cancellation.

## Convention for structured concurrency
Manual implementation of this interface is not recommended, implementation by delegation should be preferred instead. By convention, the context of a scope should contain an instance of a job to enforce the discipline of structured concurrency with propagation of cancellation.

Every coroutine builder (like launch, async, and others) and every scoping function (like coroutineScope and withContext) provides its own scope with its own Job instance into the inner block of code it runs. By convention, they all wait for all the coroutines inside their block to complete before completing themselves, thus enforcing the structured concurrency.
